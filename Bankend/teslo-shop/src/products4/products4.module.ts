import { Module } from '@nestjs/common';
import { Products4Service } from './products4.service';
import { Products4Controller } from './products4.controller';
import { TypeOrmModule } from '@nestjs/typeorm';
import { products4 } from './entities/products4.entity';

@Module({
  controllers: [Products4Controller],
  providers: [Products4Service],
  imports:[TypeOrmModule.forFeature([products4])]

})
export class Products4Module {}
