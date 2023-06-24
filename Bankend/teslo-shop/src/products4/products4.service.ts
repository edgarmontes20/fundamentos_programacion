import { BadRequestException, Injectable, InternalServerErrorException, Logger } from '@nestjs/common';
import { CreateProducts4Dto } from './dto/create-products4.dto';
import { UpdateProducts4Dto } from './dto/update-products4.dto';
import { Repository } from 'typeorm';
import { InjectRepository } from '@nestjs/typeorm';
import { products4 } from './entities/products4.entity';

@Injectable()
export class Products4Service {
  private readonly logger = new Logger('ProductsService');
  constructor(
    @InjectRepository(products4)
    private readonly productRepository:Repository<products4>,
    ){}    
    async create(createProductDto: CreateProducts4Dto) {
      try {
      
      const product =this.productRepository.create(createProductDto)
      
      await this.productRepository.save(product)
      
      return product;
      } catch (error) {
      this.logger.error(error);
      console.log(error);
      this.handleExceptions(error);
      throw new InternalServerErrorException('!ayuda')
      }
      }

  findAll() {
    return `This action returns all products4`;
  }

  findOne(id: number) {
    return `This action returns a #${id} products4`;
  }

  update(id: number, updateProducts4Dto: UpdateProducts4Dto) {
    return `This action updates a #${id} products4`;
  }

  remove(id: number) {
    return `This action removes a #${id} products4`;
  }
  private handleExceptions(error:any){
    if(error.code === '235050'){
    throw new BadRequestException(error.detail);
    }
    this.logger.error(error)
    throw new InternalServerErrorException('Unexcepted error, check server logs')
    }
    
}
