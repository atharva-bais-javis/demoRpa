package com.flipRpa.demoRpa;

import okhttp3.*;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.List;

public class abrl {

    public static String defaultPart() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        MediaType mediaType = MediaType.parse(" application/x-www-form-urlencoded");
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("__LASTFOCUS"," ")
                .addFormDataPart("__EVENTTARGET"," ")
                .addFormDataPart("__EVENTARGUMENT"," ")
                .addFormDataPart("__VIEWSTATE"," /wEPBSpWU0tleTo5NThhNDg0Ny02MmU0LTQyMDUtOTRmNi03OThhNTAyYTg0NjhkpPGANpIwjbKlLaNHLIc+LiKao55x86Q7Y1nsgSyesf0=")
                .addFormDataPart("__VIEWSTATEGENERATOR"," E26BEC63")
                .addFormDataPart("__EVENTVALIDATION"," /wEdAASY+/ctd8ffQAws149ADeDhD3gNq6qp/JTilQw5ZNkpfe4vJyKPNbAHwGois4u5nam1l6dqP2Wbh/cJ6mTdRfbZxZyUdw3Mjd+GckfC+JqZ15RrZAK6kJCrpA/JI9DOg3w=")
                .addFormDataPart("ctl00$PlaceHolderMain$signInControl$UserName"," app_pihpl_p@abrl")
                .addFormDataPart("ctl00$PlaceHolderMain$signInControl$password"," pass123$")
                .addFormDataPart("ctl00$PlaceHolderMain$signInControl$login"," Sign In")
                .build();
        Request request = new Request.Builder()
                .url("https://portal.morestore.com/_layouts/15/SharePointLandingPage/default.aspx?ReturnUrl=/_layouts/15/Authenticate.aspx")
                .method("POST", body)
                .addHeader("Host", " portal.morestore.com")
                .addHeader("Connection", " keep-alive")
                .addHeader("Content-Length", " 562")
                .addHeader("Pragma", " no-cache")
                .addHeader("Cache-Control", " no-cache")
                .addHeader("sec-ch-ua", " \"Google Chrome\";v=\"87\", \" Not;A Brand\";v=\"99\", \"Chromium\";v=\"87\"")
                .addHeader("sec-ch-ua-mobile", " ?0")
                .addHeader("Upgrade-Insecure-Requests", " 1")
                .addHeader("Origin", " https://portal.morestore.com")
                .addHeader("Content-Type", " application/x-www-form-urlencoded")
                .addHeader("User-Agent", " Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36")
                .addHeader("Accept", " text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("Sec-Fetch-Site", " same-origin")
                .addHeader("Sec-Fetch-Mode", " navigate")
                .addHeader("Sec-Fetch-User", " ?1")
                .addHeader("Sec-Fetch-Dest", " document")
                .addHeader("Referer", " https://portal.morestore.com/_layouts/15/SharePointLandingPage/default.aspx?ReturnUrl=/_layouts/15/Authenticate.aspx")
                .addHeader("Accept-Encoding", " gzip, deflate, br")
                .addHeader("Accept-Language", " en-GB,en-US;q=0.9,en;q=0.8")
                //.addHeader("Cookie", " WSS_FullScreenMode=false; WSS_FullScreenMode=false; FedAuth=77u/PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz48U1A+MCMuZnxmYmFtZW1iZXJzaGlwcHJvdmlkZXJ8YXBwX3BpaHBsX3BAYWJybCwwIy5mfGZiYW1lbWJlcnNoaXBwcm92aWRlcnxhcHBfcGlocGxfcEBhYnJsLDEzMjU2NDc2NDk0MzA0MzQxNixGYWxzZSxuRWp0bm1IaEh6bHhJTitFMkNuWUF2WlVKbmx5aFJYaC9sblpGWDhQWDZUS25rQXlNNThYM1NYQUZlVnd2UTRxK3laYWJnWmlMUU1JY1VCcU5RZGtZUUY1cTZ1YkJjNUxpM3czc3ByZWFLdnVFR3JFcEdnWEl2TGd4aTAwV003azNKV0pQd0RmcVJweTdSZ3MwZHNGSFdWY1ozSjlpVXVDeDdxeXUwUHA0QXloRW5OU1VSSnhJMHZscitSa2pObGFtck5ZZzV3UW9YWkUwRktiVzR2NTdMdWJlTnZoN2IxSUdTWmF1YTJuTnpEWXpZS2VNZzN4Nks3WkY3dTVzZlpmVThZdWUrWDEvVDZUQlVnUHJYalloWG1oVEJrcmM2SUhpMVRFQ0tHS3NYbjNWTHo1MnU4ek9ub1JvMUJMdG1aek95ZEVEcDc0dUdQRGhNaENQTllLTFE9PSxodHRwczovL3BvcnRhbC5tb3Jlc3RvcmUuY29tL19sYXlvdXRzLzE1L0F1dGhlbnRpY2F0ZS5hc3B4PC9TUD4=")
                .build();
        Response response = client.newCall(request).execute();
        CookieJar cook = client.cookieJar();
        //Cookie cookie = cook.
        List<String> Cookielist = response.headers().values("Set-Cookie");
        System.out.println(cook.toString());
        System.out.println(Cookielist);
        System.out.println(response.headers());
        System.out.println(response);
        //String cookie = response.

        return "";
    }

    public static String authenticate(String cookie) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://portal.morestore.com/_layouts/15/Authenticate.aspx")
                .method("GET", null)
                .addHeader("Host", " portal.morestore.com")
                .addHeader("Connection", " keep-alive")
                .addHeader("Pragma", " no-cache")
                .addHeader("Cache-Control", " no-cache")
                .addHeader("Upgrade-Insecure-Requests", " 1")
                .addHeader("User-Agent", " Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36")
                .addHeader("Accept", " text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("Sec-Fetch-Site", " same-origin")
                .addHeader("Sec-Fetch-Mode", " navigate")
                .addHeader("Sec-Fetch-User", " ?1")
                .addHeader("Sec-Fetch-Dest", " document")
                .addHeader("sec-ch-ua", " \"Google Chrome\";v=\"87\", \" Not;A Brand\";v=\"99\", \"Chromium\";v=\"87\"")
                .addHeader("sec-ch-ua-mobile", " ?0")
                .addHeader("Referer", " https://portal.morestore.com/_layouts/15/SharePointLandingPage/default.aspx?ReturnUrl=/_layouts/15/Authenticate.aspx")
                .addHeader("Accept-Encoding", " gzip, deflate, br")
                .addHeader("Accept-Language", " en-GB,en-US;q=0.9,en;q=0.8")
                .addHeader("Cookie", " WSS_FullScreenMode=false; FedAuth=77u/PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz48U1A+MCMuZnxmYmFtZW1iZXJzaGlwcHJvdmlkZXJ8YXBwX3BpaHBsX3BAYWJybCwwIy5mfGZiYW1lbWJlcnNoaXBwcm92aWRlcnxhcHBfcGlocGxfcEBhYnJsLDEzMjU2NDc2NDk0MzA0MzQxNixGYWxzZSxuRWp0bm1IaEh6bHhJTitFMkNuWUF2WlVKbmx5aFJYaC9sblpGWDhQWDZUS25rQXlNNThYM1NYQUZlVnd2UTRxK3laYWJnWmlMUU1JY1VCcU5RZGtZUUY1cTZ1YkJjNUxpM3czc3ByZWFLdnVFR3JFcEdnWEl2TGd4aTAwV003azNKV0pQd0RmcVJweTdSZ3MwZHNGSFdWY1ozSjlpVXVDeDdxeXUwUHA0QXloRW5OU1VSSnhJMHZscitSa2pObGFtck5ZZzV3UW9YWkUwRktiVzR2NTdMdWJlTnZoN2IxSUdTWmF1YTJuTnpEWXpZS2VNZzN4Nks3WkY3dTVzZlpmVThZdWUrWDEvVDZUQlVnUHJYalloWG1oVEJrcmM2SUhpMVRFQ0tHS3NYbjNWTHo1MnU4ek9ub1JvMUJMdG1aek95ZEVEcDc0dUdQRGhNaENQTllLTFE9PSxodHRwczovL3BvcnRhbC5tb3Jlc3RvcmUuY29tL19sYXlvdXRzLzE1L0F1dGhlbnRpY2F0ZS5hc3B4PC9TUD4=; WSS_FullScreenMode=false; FedAuth=77u/PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz48U1A+MCMuZnxmYmFtZW1iZXJzaGlwcHJvdmlkZXJ8YXBwX3BpaHBsX3BAYWJybCwwIy5mfGZiYW1lbWJlcnNoaXBwcm92aWRlcnxhcHBfcGlocGxfcEBhYnJsLDEzMjU2NDc2NDk0MzA0MzQxNixGYWxzZSxuRWp0bm1IaEh6bHhJTitFMkNuWUF2WlVKbmx5aFJYaC9sblpGWDhQWDZUS25rQXlNNThYM1NYQUZlVnd2UTRxK3laYWJnWmlMUU1JY1VCcU5RZGtZUUY1cTZ1YkJjNUxpM3czc3ByZWFLdnVFR3JFcEdnWEl2TGd4aTAwV003azNKV0pQd0RmcVJweTdSZ3MwZHNGSFdWY1ozSjlpVXVDeDdxeXUwUHA0QXloRW5OU1VSSnhJMHZscitSa2pObGFtck5ZZzV3UW9YWkUwRktiVzR2NTdMdWJlTnZoN2IxSUdTWmF1YTJuTnpEWXpZS2VNZzN4Nks3WkY3dTVzZlpmVThZdWUrWDEvVDZUQlVnUHJYalloWG1oVEJrcmM2SUhpMVRFQ0tHS3NYbjNWTHo1MnU4ek9ub1JvMUJMdG1aek95ZEVEcDc0dUdQRGhNaENQTllLTFE9PSxodHRwczovL3BvcnRhbC5tb3Jlc3RvcmUuY29tL19sYXlvdXRzLzE1L0F1dGhlbnRpY2F0ZS5hc3B4PC9TUD4=")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response);
        return "";
    }

    public static String dashboard(String cookie) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://portal.morestore.com/SitePages/dashboard.aspx")
                .method("GET", null)
                .addHeader("Host", " portal.morestore.com")
                .addHeader("Connection", " keep-alive")
                .addHeader("Pragma", " no-cache")
                .addHeader("Cache-Control", " no-cache")
                .addHeader("Upgrade-Insecure-Requests", " 1")
                .addHeader("User-Agent", " Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36")
                .addHeader("Accept", " text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("Sec-Fetch-Site", " same-origin")
                .addHeader("Sec-Fetch-Mode", " navigate")
                .addHeader("Sec-Fetch-User", " ?1")
                .addHeader("Sec-Fetch-Dest", " document")
                .addHeader("sec-ch-ua", " \"Google Chrome\";v=\"87\", \" Not;A Brand\";v=\"99\", \"Chromium\";v=\"87\"")
                .addHeader("sec-ch-ua-mobile", " ?0")
                .addHeader("Referer", " https://portal.morestore.com/_layouts/15/SharePointLandingPage/default.aspx?ReturnUrl=/_layouts/15/Authenticate.aspx")
                .addHeader("Accept-Encoding", " gzip, deflate, br")
                .addHeader("Accept-Language", " en-GB,en-US;q=0.9,en;q=0.8")
                .addHeader("Cookie", " WSS_FullScreenMode=false; FedAuth=77u/PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz48U1A+MCMuZnxmYmFtZW1iZXJzaGlwcHJvdmlkZXJ8YXBwX3BpaHBsX3BAYWJybCwwIy5mfGZiYW1lbWJlcnNoaXBwcm92aWRlcnxhcHBfcGlocGxfcEBhYnJsLDEzMjU2NDc2NDk0MzA0MzQxNixGYWxzZSxuRWp0bm1IaEh6bHhJTitFMkNuWUF2WlVKbmx5aFJYaC9sblpGWDhQWDZUS25rQXlNNThYM1NYQUZlVnd2UTRxK3laYWJnWmlMUU1JY1VCcU5RZGtZUUY1cTZ1YkJjNUxpM3czc3ByZWFLdnVFR3JFcEdnWEl2TGd4aTAwV003azNKV0pQd0RmcVJweTdSZ3MwZHNGSFdWY1ozSjlpVXVDeDdxeXUwUHA0QXloRW5OU1VSSnhJMHZscitSa2pObGFtck5ZZzV3UW9YWkUwRktiVzR2NTdMdWJlTnZoN2IxSUdTWmF1YTJuTnpEWXpZS2VNZzN4Nks3WkY3dTVzZlpmVThZdWUrWDEvVDZUQlVnUHJYalloWG1oVEJrcmM2SUhpMVRFQ0tHS3NYbjNWTHo1MnU4ek9ub1JvMUJMdG1aek95ZEVEcDc0dUdQRGhNaENQTllLTFE9PSxodHRwczovL3BvcnRhbC5tb3Jlc3RvcmUuY29tL19sYXlvdXRzLzE1L0F1dGhlbnRpY2F0ZS5hc3B4PC9TUD4=; WSS_FullScreenMode=false; FedAuth=77u/PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz48U1A+MCMuZnxmYmFtZW1iZXJzaGlwcHJvdmlkZXJ8YXBwX3BpaHBsX3BAYWJybCwwIy5mfGZiYW1lbWJlcnNoaXBwcm92aWRlcnxhcHBfcGlocGxfcEBhYnJsLDEzMjU2NDc2NDk0MzA0MzQxNixGYWxzZSxuRWp0bm1IaEh6bHhJTitFMkNuWUF2WlVKbmx5aFJYaC9sblpGWDhQWDZUS25rQXlNNThYM1NYQUZlVnd2UTRxK3laYWJnWmlMUU1JY1VCcU5RZGtZUUY1cTZ1YkJjNUxpM3czc3ByZWFLdnVFR3JFcEdnWEl2TGd4aTAwV003azNKV0pQd0RmcVJweTdSZ3MwZHNGSFdWY1ozSjlpVXVDeDdxeXUwUHA0QXloRW5OU1VSSnhJMHZscitSa2pObGFtck5ZZzV3UW9YWkUwRktiVzR2NTdMdWJlTnZoN2IxSUdTWmF1YTJuTnpEWXpZS2VNZzN4Nks3WkY3dTVzZlpmVThZdWUrWDEvVDZUQlVnUHJYalloWG1oVEJrcmM2SUhpMVRFQ0tHS3NYbjNWTHo1MnU4ek9ub1JvMUJMdG1aek95ZEVEcDc0dUdQRGhNaENQTllLTFE9PSxodHRwczovL3BvcnRhbC5tb3Jlc3RvcmUuY29tL19sYXlvdXRzLzE1L0F1dGhlbnRpY2F0ZS5hc3B4PC9TUD4=")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response);
        return "";
    }

    public static String appointmentPage(String cookie) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://portal.morestore.com/SitePages/App_Booking.aspx")
                .method("GET", null)
                .addHeader("Host", " portal.morestore.com")
                .addHeader("Connection", " keep-alive")
                .addHeader("Pragma", " no-cache")
                .addHeader("Cache-Control", " no-cache")
                .addHeader("sec-ch-ua", " \"Google Chrome\";v=\"87\", \" Not;A Brand\";v=\"99\", \"Chromium\";v=\"87\"")
                .addHeader("sec-ch-ua-mobile", " ?0")
                .addHeader("Upgrade-Insecure-Requests", " 1")
                .addHeader("User-Agent", " Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36")
                .addHeader("Accept", " text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("Sec-Fetch-Site", " same-origin")
                .addHeader("Sec-Fetch-Mode", " navigate")
                .addHeader("Sec-Fetch-User", " ?1")
                .addHeader("Sec-Fetch-Dest", " document")
                .addHeader("Referer", " https://portal.morestore.com/SitePages/dashboard.aspx")
                .addHeader("Accept-Encoding", " gzip, deflate, br")
                .addHeader("Accept-Language", " en-GB,en-US;q=0.9,en;q=0.8")
                .addHeader("Cookie", " WSS_FullScreenMode=false; FedAuth=77u/PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz48U1A+MCMuZnxmYmFtZW1iZXJzaGlwcHJvdmlkZXJ8YXBwX3BpaHBsX3BAYWJybCwwIy5mfGZiYW1lbWJlcnNoaXBwcm92aWRlcnxhcHBfcGlocGxfcEBhYnJsLDEzMjU2NDc2NDk0MzA0MzQxNixGYWxzZSxuRWp0bm1IaEh6bHhJTitFMkNuWUF2WlVKbmx5aFJYaC9sblpGWDhQWDZUS25rQXlNNThYM1NYQUZlVnd2UTRxK3laYWJnWmlMUU1JY1VCcU5RZGtZUUY1cTZ1YkJjNUxpM3czc3ByZWFLdnVFR3JFcEdnWEl2TGd4aTAwV003azNKV0pQd0RmcVJweTdSZ3MwZHNGSFdWY1ozSjlpVXVDeDdxeXUwUHA0QXloRW5OU1VSSnhJMHZscitSa2pObGFtck5ZZzV3UW9YWkUwRktiVzR2NTdMdWJlTnZoN2IxSUdTWmF1YTJuTnpEWXpZS2VNZzN4Nks3WkY3dTVzZlpmVThZdWUrWDEvVDZUQlVnUHJYalloWG1oVEJrcmM2SUhpMVRFQ0tHS3NYbjNWTHo1MnU4ek9ub1JvMUJMdG1aek95ZEVEcDc0dUdQRGhNaENQTllLTFE9PSxodHRwczovL3BvcnRhbC5tb3Jlc3RvcmUuY29tL19sYXlvdXRzLzE1L0F1dGhlbnRpY2F0ZS5hc3B4PC9TUD4=; WSS_FullScreenMode=false; FedAuth=77u/PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz48U1A+MCMuZnxmYmFtZW1iZXJzaGlwcHJvdmlkZXJ8YXBwX3BpaHBsX3BAYWJybCwwIy5mfGZiYW1lbWJlcnNoaXBwcm92aWRlcnxhcHBfcGlocGxfcEBhYnJsLDEzMjU2NDc2NDk0MzA0MzQxNixGYWxzZSxuRWp0bm1IaEh6bHhJTitFMkNuWUF2WlVKbmx5aFJYaC9sblpGWDhQWDZUS25rQXlNNThYM1NYQUZlVnd2UTRxK3laYWJnWmlMUU1JY1VCcU5RZGtZUUY1cTZ1YkJjNUxpM3czc3ByZWFLdnVFR3JFcEdnWEl2TGd4aTAwV003azNKV0pQd0RmcVJweTdSZ3MwZHNGSFdWY1ozSjlpVXVDeDdxeXUwUHA0QXloRW5OU1VSSnhJMHZscitSa2pObGFtck5ZZzV3UW9YWkUwRktiVzR2NTdMdWJlTnZoN2IxSUdTWmF1YTJuTnpEWXpZS2VNZzN4Nks3WkY3dTVzZlpmVThZdWUrWDEvVDZUQlVnUHJYalloWG1oVEJrcmM2SUhpMVRFQ0tHS3NYbjNWTHo1MnU4ek9ub1JvMUJMdG1aek95ZEVEcDc0dUdQRGhNaENQTllLTFE9PSxodHRwczovL3BvcnRhbC5tb3Jlc3RvcmUuY29tL19sYXlvdXRzLzE1L0F1dGhlbnRpY2F0ZS5hc3B4PC9TUD4=")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response);
        return "";
    }

    public static void main(String[] args) throws IOException {
        String response = defaultPart();
        String cookie = "abcd";
        response = authenticate(cookie);
        response = dashboard(cookie);
        response = appointmentPage(cookie);
    }
}
