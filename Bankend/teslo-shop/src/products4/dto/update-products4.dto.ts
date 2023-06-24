import { PartialType } from '@nestjs/mapped-types';
import { CreateProducts4Dto } from './create-products4.dto';

export class UpdateProducts4Dto extends PartialType(CreateProducts4Dto) {}
