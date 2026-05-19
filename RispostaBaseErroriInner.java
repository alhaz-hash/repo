package com.azure.app.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The RispostaBaseErroriInner model.
 */
@Fluent
public final class RispostaBaseErroriInner implements JsonSerializable<RispostaBaseErroriInner> {
    /*
     * Codice dell'errore
     */
    @Generated
    private String codice;

    /*
     * Descrizione dell'errore
     */
    @Generated
    private String descrizione;

    /**
     * Creates an instance of RispostaBaseErroriInner class.
     */
    @Generated
    public RispostaBaseErroriInner() {
    }

    /**
     * Get the codice property: Codice dell'errore.
     * 
     * @return the codice value.
     */
    @Generated
    public String getCodice() {
        return this.codice;
    }

    /**
     * Set the codice property: Codice dell'errore.
     * 
     * @param codice the codice value to set.
     * @return the RispostaBaseErroriInner object itself.
     */
    @Generated
    public RispostaBaseErroriInner setCodice(String codice) {
        this.codice = codice;
        return this;
    }

    /**
     * Get the descrizione property: Descrizione dell'errore.
     * 
     * @return the descrizione value.
     */
    @Generated
    public String getDescrizione() {
        return this.descrizione;
    }

    /**
     * Set the descrizione property: Descrizione dell'errore.
     * 
     * @param descrizione the descrizione value to set.
     * @return the RispostaBaseErroriInner object itself.
     */
    @Generated
    public RispostaBaseErroriInner setDescrizione(String descrizione) {
        this.descrizione = descrizione;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("codice", this.codice);
        jsonWriter.writeStringField("descrizione", this.descrizione);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RispostaBaseErroriInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RispostaBaseErroriInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RispostaBaseErroriInner.
     */
    @Generated
    public static RispostaBaseErroriInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RispostaBaseErroriInner deserializedRispostaBaseErroriInner = new RispostaBaseErroriInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("codice".equals(fieldName)) {
                    deserializedRispostaBaseErroriInner.codice = reader.getString();
                } else if ("descrizione".equals(fieldName)) {
                    deserializedRispostaBaseErroriInner.descrizione = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRispostaBaseErroriInner;
        });
    }
}
