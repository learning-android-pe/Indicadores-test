package com.hans.indicadores.io;

import com.hans.indicadores.model.IndicadoresResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IndicadorService {

    @GET(".")
    Call<IndicadoresResponse> getIndicadorList();
}