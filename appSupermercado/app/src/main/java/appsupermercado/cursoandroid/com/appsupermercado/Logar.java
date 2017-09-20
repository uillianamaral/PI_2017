package appsupermercado.cursoandroid.com.appsupermercado;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Logar extends Fragment {

    private TextView linkCadastrar;

    public Logar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_logar, container, false);

        linkCadastrar = (TextView) view.findViewById(R.id.linkCadastrar);

        linkCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().
                        getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.frameLayout, new Cadastrar()).
                        commit();
            }
        });

        return view;

    }

}
