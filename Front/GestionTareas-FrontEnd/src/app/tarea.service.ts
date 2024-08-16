import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Tarea } from './tarea';
import { Usuario } from './usuario';

@Injectable({
  providedIn: 'root'
})
export class TareaService {
  //url lista todas las tareas en el back
  private baseURL="http://localhost:3333/api";

  constructor(private httpclient: HttpClient) { }

  //metodo para obtener tareas
  obtenerListaTareas():Observable<Tarea[]>{
    return this.httpclient.get<Tarea[]>(`${this.baseURL}`);
  }
 
  //metodo para guardar una tarea
  registrarTarea(tarea:Tarea):Observable<Object>{
    return this.httpclient.post(`${this.baseURL}`,tarea);
  }

  registrarUsuario(usuario:Usuario):Observable<Object>{
    return this.httpclient.post(`${this.baseURL}`,Usuario);
  }
}
