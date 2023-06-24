import { Controller, Get, Post, Body, Patch, Param, Delete } from '@nestjs/common';
import { Products4Service } from './products4.service';
import { CreateProducts4Dto } from './dto/create-products4.dto';
import { UpdateProducts4Dto } from './dto/update-products4.dto';

@Controller('products4')
export class Products4Controller {
  constructor(private readonly products4Service: Products4Service) {}

  @Post()
  create(@Body() createProducts4Dto: CreateProducts4Dto) {
    return this.products4Service.create(createProducts4Dto);
  }

  @Get()
  findAll() {
    return this.products4Service.findAll();
  }

  @Get(':id')
  findOne(@Param('id') id: string) {
    return this.products4Service.findOne(+id);
  }

  @Patch(':id')
  update(@Param('id') id: string, @Body() updateProducts4Dto: UpdateProducts4Dto) {
    return this.products4Service.update(+id, updateProducts4Dto);
  }

  @Delete(':id')
  remove(@Param('id') id: string) {
    return this.products4Service.remove(+id);
  }
}
