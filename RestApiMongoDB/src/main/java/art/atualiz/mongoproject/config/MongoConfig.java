package art.atualiz.mongoproject.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

/**
 * Configuração necessária para usar índices no MongoDB
 * Adicionada a propriedade condicional se está usando instância local ou no Atlas
 * Localmente, funciona o índice, mas no Atlas (FREE) não.
 */
@ConditionalOnProperty(value = "app.use.mongolocal", havingValue = "true")
@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "MongoProject2";
    }

    @Override
    protected boolean autoIndexCreation() {
        return true;
    }

    @Bean
    @Override
    public MongoClient mongoClient() {
        // Configure o cliente MongoDB local
        return MongoClients.create("mongodb://127.0.0.1:27017");
    }
}
