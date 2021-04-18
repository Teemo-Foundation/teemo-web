import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { retry, catchError, map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private apiUrl = environment.apiUrl;
  httpOptions = {}

  constructor(
    private http: HttpClient,
    private cookieService: CookieService
    ) { }

  protected get<T>(path?: string, body?: any): Observable<T>{
    return this.http.get('', this.httpOptions)
      .pipe(
        retry(1),
        catchError('treat error'),
        map('treat result')
      );
  }

  protected put<T>(path?: string, body?: any): Observable<T>{
    return this.http.get('', this.httpOptions)
      .pipe(
        retry(1),
        catchError('treat error'),
        map('treat resukt')
      );
  }

  protected post<T>(path?: string, body?: any): Observable<T>{
    return this.http.get('', this.httpOptions)
      .pipe(
        retry(1),
        catchError('treat error'),
        map('treat result')
      );
  }
}
