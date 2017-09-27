package appsupermercado.cursoandroid.com.appsupermercado;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Cadastrar extends Fragment {

    private EditText usuarioCadastrar;
    private EditText senhaCadastrar;
    private EditText nome;
    private EditText telefone;
    private EditText endereco;
    private Button cadastrar;

    public Cadastrar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cadastrar, container, false);

        usuarioCadastrar = (EditText) view.findViewById(R.id.usuarioCadastrar);
        senhaCadastrar = (EditText) view.findViewById(R.id.senhaCadastrar);
        nome = (EditText) view.findViewById(R.id.nome);
        telefone = (EditText) view.findViewById(R.id.telefone);
        endereco = (EditText) view.findViewById(R.id.endereco);

        final String textoUsuario = usuarioCadastrar.getText().toString();
        final String textoSenha = senhaCadastrar.getText().toString();
        final String textoNome = nome.getText().toString();
        final String textoTelefone = telefone.getText().toString();
        final String textoEndereco = endereco.getText().toString();

        cadastrar = (Button) view.findViewById(R.id.cadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textoUsuario.isEmpty() || textoSenha.isEmpty() || textoNome.isEmpty() ||
                        textoTelefone.isEmpty() || textoEndereco.isEmpty()){

                    Toast.makeText(getActivity(), "Campo(s) vazios!", Toast.LENGTH_SHORT).show();
                    usuarioCadastrar.setText("");
                    senhaCadastrar.setText("");
                    nome.setText("");
                    telefone.setText("");
                    endereco.setText("");

                }else{

                    Toast.makeText(getActivity(), "Conta cadastrada com sucesso!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        return view;
    }

}
