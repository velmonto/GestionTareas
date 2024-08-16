import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaTareasComponent } from './lista-tareas/lista-tareas.component';
import { HttpClientModule } from '@angular/common/http';
import { RegistrarUsuarioComponent } from './registrar-usuario/registrar-usuario.component';
import { FormsModule } from '@angular/forms';
import { InicioSesionComponent } from './inicio-sesion/inicio-sesion.component';
import { RegistrarTareaComponent } from './registrar-tarea/registrar-tarea.component';
import { CrearSubtareaComponent } from './crear-subtarea/crear-subtarea.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaTareasComponent,
    RegistrarUsuarioComponent,
    InicioSesionComponent,
    RegistrarTareaComponent,
    CrearSubtareaComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
