package org.schabi.newpipe.extractor.services.youtube.extractors;

import org.schabi.newpipe.extractor.utils.Utils;

import static org.schabi.newpipe.extractor.utils.Utils.HTTP;
import static org.schabi.newpipe.extractor.utils.Utils.HTTPS;

final class YoutubeUtils {

    private YoutubeUtils() {
    }

    public static String toHttps(String url) {
        if (url.startsWith("//")) {
            url = url.substring(2);
        }
        if (url.startsWith(HTTP)) {
            url = Utils.replaceHttpWithHttps(url);
        } else if (!url.startsWith(HTTPS)) {
            url = HTTPS + url;
        }
        return url;
    }
}