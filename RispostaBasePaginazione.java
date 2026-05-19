package com.azure.app.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The RispostaBasePaginazione model.
 */
@Fluent
public final class RispostaBasePaginazione implements JsonSerializable<RispostaBasePaginazione> {
    /*
     * Numero totale degli oggetti restituiti dalla ricerca
     */
    @Generated
    private Integer totale;

    /*
     * Numero della pagina restituita
     */
    @Generated
    private Integer pagina;

    /*
     * Numero degli oggetti restituiti in una singola pagina
     */
    @Generated
    private Integer perPagina;

    /*
     * Parametri per accedere ai dati della pagina successiva
     */
    @Generated
    private String prossima;

    /**
     * Creates an instance of RispostaBasePaginazione class.
     */
    @Generated
    public RispostaBasePaginazione() {
    }

    /**
     * Get the totale property: Numero totale degli oggetti restituiti dalla ricerca.
     * 
     * @return the totale value.
     */
    @Generated
    public Integer getTotale() {
        return this.totale;
    }

    /**
     * Set the totale property: Numero totale degli oggetti restituiti dalla ricerca.
     * 
     * @param totale the totale value to set.
     * @return the RispostaBasePaginazione object itself.
     */
    @Generated
    public RispostaBasePaginazione setTotale(Integer totale) {
        this.totale = totale;
        return this;
    }

    /**
     * Get the pagina property: Numero della pagina restituita.
     * 
     * @return the pagina value.
     */
    @Generated
    public Integer getPagina() {
        return this.pagina;
    }

    /**
     * Set the pagina property: Numero della pagina restituita.
     * 
     * @param pagina the pagina value to set.
     * @return the RispostaBasePaginazione object itself.
     */
    @Generated
    public RispostaBasePaginazione setPagina(Integer pagina) {
        this.pagina = pagina;
        return this;
    }

    /**
     * Get the perPagina property: Numero degli oggetti restituiti in una singola pagina.
     * 
     * @return the perPagina value.
     */
    @Generated
    public Integer getPerPagina() {
        return this.perPagina;
    }

    /**
     * Set the perPagina property: Numero degli oggetti restituiti in una singola pagina.
     * 
     * @param perPagina the perPagina value to set.
     * @return the RispostaBasePaginazione object itself.
     */
    @Generated
    public RispostaBasePaginazione setPerPagina(Integer perPagina) {
        this.perPagina = perPagina;
        return this;
    }

    /**
     * Get the prossima property: Parametri per accedere ai dati della pagina successiva.
     * 
     * @return the prossima value.
     */
    @Generated
    public String getProssima() {
        return this.prossima;
    }

    /**
     * Set the prossima property: Parametri per accedere ai dati della pagina successiva.
     * 
     * @param prossima the prossima value to set.
     * @return the RispostaBasePaginazione object itself.
     */
    @Generated
    public RispostaBasePaginazione setProssima(String prossima) {
        this.prossima = prossima;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("totale", this.totale);
        jsonWriter.writeNumberField("pagina", this.pagina);
        jsonWriter.writeNumberField("perPagina", this.perPagina);
        jsonWriter.writeStringField("prossima", this.prossima);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RispostaBasePaginazione from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RispostaBasePaginazione if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RispostaBasePaginazione.
     */
    @Generated
    public static RispostaBasePaginazione fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RispostaBasePaginazione deserializedRispostaBasePaginazione = new RispostaBasePaginazione();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("totale".equals(fieldName)) {
                    deserializedRispostaBasePaginazione.totale = reader.getNullable(JsonReader::getInt);
                } else if ("pagina".equals(fieldName)) {
                    deserializedRispostaBasePaginazione.pagina = reader.getNullable(JsonReader::getInt);
                } else if ("perPagina".equals(fieldName)) {
                    deserializedRispostaBasePaginazione.perPagina = reader.getNullable(JsonReader::getInt);
                } else if ("prossima".equals(fieldName)) {
                    deserializedRispostaBasePaginazione.prossima = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRispostaBasePaginazione;
        });
    }
}
