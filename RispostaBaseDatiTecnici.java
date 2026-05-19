package com.azure.app.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The RispostaBaseDatiTecnici model.
 */
@Fluent
public final class RispostaBaseDatiTecnici implements JsonSerializable<RispostaBaseDatiTecnici> {
    /*
     * Ambito assicurativo
     */
    @Generated
    private String ambito;

    /*
     * Sistema applicativo sorgente
     */
    @Generated
    private String sistemaSorgente;

    /**
     * Creates an instance of RispostaBaseDatiTecnici class.
     */
    @Generated
    public RispostaBaseDatiTecnici() {
    }

    /**
     * Get the ambito property: Ambito assicurativo.
     * 
     * @return the ambito value.
     */
    @Generated
    public String getAmbito() {
        return this.ambito;
    }

    /**
     * Set the ambito property: Ambito assicurativo.
     * 
     * @param ambito the ambito value to set.
     * @return the RispostaBaseDatiTecnici object itself.
     */
    @Generated
    public RispostaBaseDatiTecnici setAmbito(String ambito) {
        this.ambito = ambito;
        return this;
    }

    /**
     * Get the sistemaSorgente property: Sistema applicativo sorgente.
     * 
     * @return the sistemaSorgente value.
     */
    @Generated
    public String getSistemaSorgente() {
        return this.sistemaSorgente;
    }

    /**
     * Set the sistemaSorgente property: Sistema applicativo sorgente.
     * 
     * @param sistemaSorgente the sistemaSorgente value to set.
     * @return the RispostaBaseDatiTecnici object itself.
     */
    @Generated
    public RispostaBaseDatiTecnici setSistemaSorgente(String sistemaSorgente) {
        this.sistemaSorgente = sistemaSorgente;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("ambito", this.ambito);
        jsonWriter.writeStringField("sistemaSorgente", this.sistemaSorgente);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RispostaBaseDatiTecnici from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RispostaBaseDatiTecnici if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RispostaBaseDatiTecnici.
     */
    @Generated
    public static RispostaBaseDatiTecnici fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RispostaBaseDatiTecnici deserializedRispostaBaseDatiTecnici = new RispostaBaseDatiTecnici();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ambito".equals(fieldName)) {
                    deserializedRispostaBaseDatiTecnici.ambito = reader.getString();
                } else if ("sistemaSorgente".equals(fieldName)) {
                    deserializedRispostaBaseDatiTecnici.sistemaSorgente = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRispostaBaseDatiTecnici;
        });
    }
}
