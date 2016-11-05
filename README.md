## Consumir servicios REST con Retrofit

# Dependencias 
 ```
    compile 'com.android.support:appcompat-v7:23.4.0'
    compile 'com.android.support:support-v4:23.4.0'
    compile 'com.android.support:design:23.4.0'
    compile 'com.android.support:cardview-v7:23.4.0'
    compile 'com.android.support:recyclerview-v7:23.4.0'
    compile 'com.squareup.retrofit2:retrofit:2.1.0'
    compile 'com.squareup.retrofit2:converter-gson:2.1.0'
 ```

# Servicio REST - JSON
 - [http://mindicador.cl/api](http://mindicador.cl/api)
 - Trama Json
  ```
     {"version":"1.4.0","autor":"mindicador.cl","fecha":"2016-11-05T11:00:00.000Z","uf":{"codigo":"uf","nombre":"Unidad de fomento (UF)","unidad_medida":"Pesos","fecha":"2016-11-05T04:00:00.000Z","valor":26269.98},"ivp":{"codigo":"ivp","nombre":"Indice de valor promedio (IVP)","unidad_medida":"Pesos","fecha":"2016-11-05T04:00:00.000Z","valor":27319.1},"dolar":{"codigo":"dolar","nombre":"Dólar observado","unidad_medida":"Pesos","fecha":"2016-11-04T04:00:00.000Z","valor":650.72},"dolar_intercambio":{"codigo":"dolar_intercambio","nombre":"Dólar acuerdo","unidad_medida":"Pesos","fecha":"2014-11-13T05:00:00.000Z","valor":758.87},"euro":{"codigo":"euro","nombre":"Euro","unidad_medida":"Pesos","fecha":"2016-11-04T04:00:00.000Z","valor":722.62},"ipc":{"codigo":"ipc","nombre":"Indice de Precios al Consumidor (IPC)","unidad_medida":"Porcentaje","fecha":"2016-09-01T04:00:00.000Z","valor":0.2},"utm":{"codigo":"utm","nombre":"Unidad Tributaria Mensual (UTM)","unidad_medida":"Pesos","fecha":"2016-11-01T04:00:00.000Z","valor":46091},"imacec":{"codigo":"imacec","nombre":"Imacec","unidad_medida":"Porcentaje","fecha":"2016-08-01T04:00:00.000Z","valor":2.5},"tpm":{"codigo":"tpm","nombre":"Tasa Política Monetaria (TPM)","unidad_medida":"Porcentaje","fecha":"2016-11-04T04:00:00.000Z","valor":3.5},"libra_cobre":{"codigo":"libra_cobre","nombre":"Libra de Cobre","unidad_medida":"Dólar","fecha":"2016-11-04T04:00:00.000Z","valor":2.23},"tasa_desempleo":{"codigo":"tasa_desempleo","nombre":"Tasa de desempleo","unidad_medida":"Porcentaje","fecha":"2016-09-01T04:00:00.000Z","valor":6.8}}
  ```
  

Output

```
 V/INDICADORES: uf Indicador{codigo='uf', nombre='Unidad de fomento (UF)', unidad_medida='Pesos', fecha='2016-11-05T04:00:00.000Z', valor=26269.98}
```
