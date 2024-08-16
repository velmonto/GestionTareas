import { Component, OnInit } from '@angular/core';
import { Usuario } from '../usuario';
import { TareaService } from '../tarea.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registrar-usuario',
  templateUrl: './registrar-usuario.component.html',
  styleUrls: ['./registrar-usuario.component.css']
})
export class RegistrarUsuarioComponent implements OnInit{

  usuario:Usuario = new Usuario();
constructor(private usuarioServicio: TareaService, private router:Router){}
ngOnInit(): void {
  
}

guardarUsuario(){
this.usuarioServicio.registrarUsuario(this.usuario).subscribe(dato => {
console.log(dato);
  
}, error => console.log(error));

}


  onSubmit(){
    this.guardarUsuario();
  }
}
