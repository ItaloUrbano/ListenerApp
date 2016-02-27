package ifpb.edu.br.listenerapp.asynctask;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import java.io.IOException;

import ifpb.edu.br.listenerapp.util.HttpService;
import ifpb.edu.br.listenerapp.util.Response;

public class BuscarNomeAsyncTask extends AsyncTask<JSONObject, Void, Response> {


    @Override
    protected Response doInBackground(JSONObject... jsonObjects) {

        Response response = null;

        JSONObject jsonObject = jsonObjects[0];
        Log.i("EditTextListener", "doInBackground (JSON): " + jsonObject);

        try {
            response = HttpService.sendJSONPostResquest("get-byname", jsonObject);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }

    @Override
    protected void onPostExecute(Response response) {

        Log.i("EditTextListener", "Código HTTP: " + response.getStatusCodeHttp()
                + " Conteúdo: " + response.getContentValue());
    }
}
