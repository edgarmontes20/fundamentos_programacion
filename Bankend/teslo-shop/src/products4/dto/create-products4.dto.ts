import { IsIn, IsNumber, IsPositive, IsString, MinLength } from "class-validator";

export class CreateProducts4Dto {
@IsString()
@MinLength(3)
usuario:string;
@IsString()
@MinLength(5)
password:string;
@IsString()
@MinLength(1)
nombre:string;
@IsString()
@MinLength(1)
apellido:string;
@IsIn(['cc','ti','ce','na'])
tipoDocumento:string;
@IsNumber()
@IsPositive()
documento:number;
@IsString()
@MinLength(1)
title:string;
}
