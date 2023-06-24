import { Column, 
         Entity,
         PrimaryGeneratedColumn 
        } from "typeorm";
@Entity()
export class products4 {
@PrimaryGeneratedColumn('uuid')
id:string;
@Column('text',{
unique:true
})
usuario:string;
@Column('text')
password:string;
@Column('text')
nombre:string;
@Column('text')
apellido:string;
@Column('text')
tipoDocumento:string;
@Column('numeric')
documento:number;
@Column('text',{
unique:true
})
title:string;

}
