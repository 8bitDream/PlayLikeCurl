package karacken.curl;

import android.net.Uri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by karacken on 18/11/16.
 * Updated by AbandonedCart 10/2024
 */
public class PageCurlAdapter {

    List<Uri> uri_list = new ArrayList<>();

    public PageCurlAdapter(Uri[] uri_list) {
        Collections.addAll(this.uri_list, uri_list);
    }

    public int getCount() {
        return uri_list.size();
    }

    public Uri getItemUri(int position) {
        return uri_list.get(position);
    }

//    List<String> res_list = new ArrayList<>();
//
//    public PageCurlAdapter(String[] res_list) {
//        Collections.addAll(this.res_list, res_list);
//    }
//
//    public int getCount() {
//        return res_list.size();
//    }
//
//    public String getItemResource(int position) {
//        return res_list.get(position);
//    }
}
