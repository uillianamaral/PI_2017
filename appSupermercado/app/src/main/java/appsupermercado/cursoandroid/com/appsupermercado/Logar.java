package appsupermercado.cursoandroid.com.appsupermercado;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Logar extends Fragment {

    private TextView linkCadastrar;
    private EditText usuarioLoagr;
    private EditText senhaLogar;
    private Button login;

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

        usuarioLoagr = (EditText) view.findViewById(R.id.usuarioLogar);
        senhaLogar = (EditText) view.findViewById(R.id.senhaLogar);

        final String textoUsuario = usuarioLoagr.getText().toString();
        final String textoSenha = senhaLogar.getText().toString();

        login = (Button) view.findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textoUsuario.isEmpty() || textoSenha.isEmpty()){
                    Toast.makeText(getActivity(), "Campo(s) vazios!", Toast.LENGTH_SHORT).show();
                    usuarioLoagr.setText("");
                    senhaLogar.setText("");

                }else{
                    Toast.makeText(getActivity(), "Logado com sucesso!", Toast.LENGTH_SHORT).show();

                }
            }
        });

        return view;

    }

}
