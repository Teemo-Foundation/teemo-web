import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { TeemoRoutes } from "./teemo/teemo-routing.module";

export const routes: Routes = [
    {
        path: '',
        redirectTo: 'login',
        pathMatch: 'full'
    }, ... TeemoRoutes
];

@NgModule({
    imports: [ RouterModule.forRoot(routes)],
    exports: [ RouterModule ]
})

export class appRoutingModule{

}