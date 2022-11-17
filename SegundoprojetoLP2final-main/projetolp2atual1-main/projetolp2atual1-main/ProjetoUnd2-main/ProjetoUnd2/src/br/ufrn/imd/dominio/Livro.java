package br.ufrn.imd.dominio;

import java.util.ArrayList;
import java.util.List;

public class Livro extends ItemAcervo{
	
	public Livro() {
		
	}
	
	public Livro (String autor, String isbn, String editora, int edicao, String genero) {
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.edicao = edicao;
        this.genero = genero;
		
	}
	
	private String genero;
	private String isbn;
	//lembrar que são 13 digitos
	
	public String getGenero() {
		return genero;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	private static List<Livro> livros = new ArrayList<>();

    public static Livro cadastrarNovoLivro(String isbn, String autor, int edicao, String editora, String genero){
        Livro novoLivro;
        novoLivro = new Livro( isbn, autor, editora, edicao, genero );
        livros.add(novoLivro);
        return novoLivro;
    }

    public static String listarTodosOsLivros() {
        String livroInformacao = "";
        for(Livro livro : livros) {
            livroInformacao += livro.toString();
        }
        return livroInformacao;
    }

    public static List<Livro> buscarLivroPorAutor(String autor) throws Exception {
        List<Livro>livrosPesquisados = new ArrayList<>();
        for (Livro livro: livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)){
                livrosPesquisados.add(livro);
            }
        }
        if (!livrosPesquisados.isEmpty()) {
            return livrosPesquisados;
        } else {
            throw new Exception("Nenhum livro foi localizado pelo autor " + autor);
        }
    }

    public static List<Livro> buscarLivroPorEditora(String editora) throws Exception {
        List<Livro>livrosPesquisados = new ArrayList<>();
        for (Livro livro: livros) {
            if (livro.getEditora().equalsIgnoreCase(editora)){
                livrosPesquisados.add(livro);
            }
        }
        if (!livrosPesquisados.isEmpty()) {
            return livrosPesquisados;
        } else {
            throw new Exception("Nenhum livro foi localizado com a editora  " + editora);
        }
    }

    public static List<Livro> buscarLivroPorGenero(String genero) throws Exception {
        List<Livro> livrosPorGenero = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                livrosPorGenero.add(livro);
            }
        }
        if (!livrosPorGenero.isEmpty()) {
            return livrosPorGenero;
        } else {
            throw new Exception("Nenhumm livro na biblioteca foi localizado com o genero " + genero);
        }
    }
	
    public static List<Livro> buscarLivroExclusivo(Boolean exclusivo) throws Exception {
        List<Livro>livrosPesquisados = new ArrayList<>();
        for (Livro livro: livros) {
            if (livro.isExclusivo()){
                livrosPesquisados.add(livro);
            }
        }
        if (!livrosPesquisados.isEmpty()) {
            return livrosPesquisados;
        } else {
            throw new Exception("Nenhum livro foi localizado com o perfil  " + exclusivo);
        }
    }
    
    @Override
	public String toString() {
		
		return "Livro(s): \n" +"Titulo: " + titulo + " Editora: " + editora + " Qtd Copias: " 
		+ qtdCopias + " Qtd Paginas: " + qtdPaginas;
		
	}
    
    //public void alugarLivro(String id) {
    //    Livro livroAlugado = new Livro();
        //livroAlugado.setId(id);
        //livroAlugado.setDisponivel(true);
        //livroRepository.update(livroDto);
    //}
    
}

