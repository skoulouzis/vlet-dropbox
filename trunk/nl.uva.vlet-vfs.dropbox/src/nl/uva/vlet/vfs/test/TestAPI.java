/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.uva.vlet.vfs.test;

import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuthNoRedirect;
import java.io.IOException;
import java.util.Locale;

/**
 *
 * @author skoulouz
 */
public class TestAPI {

    public static void main(String[] args) throws IOException, DbxException {
        // Get your app key and secret from the Dropbox developers website.
        final String APP_KEY = "APP_KEY";
        final String APP_SECRET = "INSERT_APP_SECRET";

        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);

        DbxRequestConfig config = new DbxRequestConfig(
                "JavaTutorial/1.0", Locale.getDefault().toString());
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
        String authorizeUrl = webAuth.start();
        
        System.err.println("authorizeUrl: "+authorizeUrl);
    }
}
