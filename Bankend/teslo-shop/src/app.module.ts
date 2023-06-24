import { Module } from '@nestjs/common';
import { ConfigModule } from '@nestjs/config';
import { TypeOrmModule } from '@nestjs/typeorm';
import { Products4Module } from './products4/products4.module';

@Module({
  imports: [ConfigModule.forRoot(),
    TypeOrmModule.forRoot({       
      type:'postgres',       
      host: process.env.DB_HOST,
      port: +process.env.DB_PORT,
      database: process.env.DB_NAME,
      username: process.env.DB_USERNAME,
      password: process.env.DB_PASSWORD,
      autoLoadEntities: true,
      synchronize: true,//sincronizar automaticamente
    }),
    Products4Module   ],
  controllers: [],
  providers: [],
})
export class AppModule {}
