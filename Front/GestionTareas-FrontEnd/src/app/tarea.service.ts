import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Tarea } from './tarea';

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
}
