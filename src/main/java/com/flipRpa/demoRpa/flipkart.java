package com.flipRpa.demoRpa;

import net.minidev.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class flipkart {
    public static void main(String[] args) {
        try {
            String url = "https://vendorhub.flipkart.com/vendor/purchase-orders?page_number=1&page_size=10&status=pending_acknowledgement&order=desc&sort_column=expiry_date";
            HttpClient client = new DefaultHttpClient();
            //HttpPost post = new HttpPost(url);
            HttpGet httpget = new HttpGet(url);
            String cookie = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJyZXRhaWwtdmVuZG9yLXBvcnRhbCIsImlhdCI6MTYxMTc0NDMxNiwiZXhwIjoxNjExODMwNzE2LCJmaXJzdF9uYW1lIjoiQU5LSVQiLCJsYXN0X25hbWUiOiJLVU1BUiIsImVtYWlsX2lkIjoiYW5raXQua3VtYXJAamF2aXMuaW4iLCJwaG9uZV9udW1iZXIiOiIrOTEgOTcxODEgMzc1NTciLCJpc19leHRlcm5hbCI6dHJ1ZSwibnVtYmVyX29mX3ZlbmRvcnMiOjEsIm51bWJlcl9vZl9yZXRhaWxlcnMiOjEsImlwX2FkZHJlc3MiOiIxMDYuMjAxLjk0LjI5IiwicmV0YWlsZXJOYW1lIjoiRktJIiwicmV0YWlsZXIiOiJma2kiLCJ0ZW5hbnQiOiJGS0kiLCJ2ZW5kb3JfaWQiOiJWRU4xOTcwNSIsInZlbmRvcl9uYW1lIjoiUmVja2l0dCBCZW5ja2lzZXIgKEluZGlhKSBQdnQuIEx0ZC4iLCJwZXJtaXNzaW9ucyI6WyJWSUVXX1BST0RVQ1RfU1RPQ0siLCJNT0RJRllfUFJPRFVDVF9TVE9DSyIsIlZJRVdfQ0FUQUxPR1VFIiwiTU9ESUZZX0NBVEFMT0dVRSIsIlZJRVdfRklOQU5DRSIsIlZJRVdfQUdSRUVNRU5UU19DTEFJTVMiLCJNT0RJRllfQUdSRUVNRU5UU19DTEFJTVMiLCJWSUVXX01BVEVSSUFMX01PVkVNRU5UIiwiTU9ESUZZX01BVEVSSUFMX01PVkVNRU5UIiwiVklFV19QUk9EVUNUX0NPTVBMSUFOQ0UiLCJNT0RJRllfUFJPRFVDVF9DT01QTElBTkNFIiwiVklFV19BR1JFRU1FTlRTX0FQUCIsIk1PRElGWV9BR1JFRU1FTlRTX0FQUCIsIlZJRVdfUEFZTUVOVCIsIlZJRVdfUkVQT1JUUyIsIlZJRVdfTUFOQUdFX1VTRVJTIl0sInZlbmRvcl9sZXZlbF9hY2Nlc3MiOnRydWUsInJvbGVzIjoiT3BlcmF0aW9ucyBIZWFkIn0.1Ksg-LFBopSn-ElTSmweaxThVXZKnY5bcVwaFxnxFjk";

            httpget.setHeader("Content-Type", "application/json;charset=utf-8");
            httpget.setHeader("Connection", " keep-alive");
            httpget.setHeader("Pragma", " no-cache");
            httpget.setHeader("Cache-Control", " no-cache");
            httpget.setHeader("sec-ch-ua", " \"Google Chrome\";v=\"87\", \" Not;A Brand\";v=\"99\", \"Chromium\";v=\"87\"");
            httpget.setHeader("Accept", " application/json, text/javascript, */*; q=0.01");
            httpget.setHeader("x-csrf-token", " pI8T96ZS-7GHv8PUoKKjncafB2iHWdQx7Dsk");
            httpget.setHeader("sec-ch-ua-mobile", " ?0");
            httpget.setHeader("User-Agent", " Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36");
            httpget.setHeader("X-Requested-With", " XMLHttpRequest");
            httpget.setHeader("Sec-Fetch-Site", " same-origin");
            httpget.setHeader("Sec-Fetch-Mode", " cors");
            httpget.setHeader("Sec-Fetch-Dest", " empty");
            httpget.setHeader("Referer", " https://vendorhub.flipkart.com/");
            //httpget.setHeader("Accept-Encoding", " gzip, deflate, br");
            // *********************************    issue 
            httpget.setHeader("Accept-Language", " en-GB,en-US;q=0.9,en;q=0.8");
            httpget.setHeader("Cookie", " T=TI161082038290701322427552368144998874179584437554123492506304967289; SN=VI92ABE213D4FE4112B365FA486499434D.TOK34D31DA37E424DA89260C256F109577A.1610820382.LO; AMCV_17EB401053DAF4840A490D4C%40AdobeOrg=-227196251%7CMCIDTS%7C18644%7CMCMID%7C09051778703460644543203364006888943874%7CMCAAMLH-1611425183%7C12%7CMCAAMB-1611425183%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1610827583s%7CNONE%7CMCAID%7CNONE; S=d1t13Kj8AP01KP2w4Hz8/Pz9VP9hwxsrDqUkXazEVjH8d4gu+hwDD8n1X87j8jgM6WrDm8bqicnGfna5NveUfX4KPtQ==; _ga=GA1.2.327284725.1610948580; _csrf=1EIriJ_7UhZ8I6mjsCgvKz0d; _gid=GA1.2.405300.1611744287; access_token="+cookie);

            //ObjectMapper mapper = new ObjectMapper();

            JSONObject lead = new JSONObject();
            System.out.println("Converted request " + lead.toString());
            System.out.println("Url " + url);

            //StringEntity params = new StringEntity(lead.toString());
            //post.setEntity(params);

            HttpResponse response = client.execute(httpget);
            Integer status = response.getStatusLine().getStatusCode();
            System.out.println("Response Code : " +status);

            if(status==401){
                //unauthorised token expired section
            } else if (status==200){
                //handled
//                BufferedReader rd = new BufferedReader(
//                        new InputStreamReader(response.getEntity().getContent()));

                HttpEntity entity = response.getEntity();
                String responseString = EntityUtils.toString(entity, "UTF-8");
                System.out.println(responseString);

//                StringBuffer result = new StringBuffer();
//                String line = "";
//                while ((line = rd.readLine()) != null) {
//                    result.append(line);
//                }

               // System.out.println(result.toString());
            } else {
                //unhandled
            }



//            JSONObject obj = new JSONObject(result.toString());
            //counsel = obj.has("manager") ? new JSONObject(obj.get("manager").toString()) : null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
