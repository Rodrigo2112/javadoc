/**
 * 
 * @author Asus
 */
public class URLEncoder 
{
    
    /**
     * <h1>Parameters:</h1>
     * s - String to be translated <br>
     * <p>enc - The name of a supported character encoding.</p>
     * <h1>Returns:</h1>
     * the translated String.<br>
     * <h1>Throws:</h1>
     * <p>UnsupportedEncodingException - If the named encoding is not supported</p>
     * <h1>Since:</h1>
     * 1.4
     * <h1>Since also:</h1>
     * URLDecoder.decode(java.lang.String, java.lang.String) 
     */
    public static String Encoder(String s,String enc)
    {
        return s;
    }
    
    /**
     * <p>Deprecated</p>
     * public static String encode(String s)<br>
     * Deprecated. The resulting string may vary depending on the platform's default encoding. Instead, use the encode(String,String) method to specify the encoding. Translates a string into x-www-form-urlencoded format. This method uses the platform's default encoding as the encoding scheme to obtain the bytes for unsafe characters.
     * <h1>Parameters:</h1>
     * s - String to be translated. <br>
     * <h1>Returns:</h1>
     * the translated String.
     */
    public static String encode(String s)
    {
        return s;
    }
}
   
