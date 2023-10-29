package com.devamatre.appsuite.http.encoding;

import com.devamatre.appsuite.http.ContentEncoding;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.GzipDecompressingEntity;

/**
 * @author Rohtash Lakra
 * @created 4/13/20 6:14 PM
 */
public final class GZIPEncoding extends ContentEncoding {

    public GZIPEncoding() {
        super(EncodingType.GZIP);
    }

    /**
     * @param rawEntity
     * @return
     */
    public HttpEntity wrapResponseEntity(HttpEntity rawEntity) {
        return new GzipDecompressingEntity(rawEntity);
    }
}
