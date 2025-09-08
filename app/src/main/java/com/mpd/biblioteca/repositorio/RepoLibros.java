package com.mpd.biblioteca.repositorio;

import com.mpd.biblioteca.modelo.GeneroEnum;
import com.mpd.biblioteca.modelo.Libro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RepoLibros {

    private final ArrayList<Libro> libros;

    public RepoLibros() {
        libros = new ArrayList<>();

        libros.add(new Libro("El Principito", "Antoine de Saint-Exupéry", "La historia de un pequeño príncipe que viaja por el universo, aprendiendo sobre el amor, la amistad y el significado de la vida. Una fábula universal con un profundo mensaje filosófico. Ideal para todas las edades.", new HashSet<>(Arrays.asList(GeneroEnum.CUENTO, GeneroEnum.FILOSOFIA))));
        libros.add(new Libro("1984", "George Orwell", "En un futuro distópico, Winston Smith lucha contra un gobierno totalitario que lo vigila en cada aspecto de su vida. Una novela que explora el control del poder, la manipulación de la información y la pérdida de la individualidad.", new HashSet<>(Arrays.asList(GeneroEnum.CIENCIA_FICCION, GeneroEnum.DRAMA, GeneroEnum.THRILLER))));
        libros.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", "La historia de la familia Buendía a través de siete generaciones en el mítico pueblo de Macondo. Una obra cumbre del realismo mágico que explora temas como el amor, la soledad y la complejidad de la naturaleza humana.", new HashSet<>(Arrays.asList(GeneroEnum.NOVELA_HISTORICA, GeneroEnum.DRAMA))));
        libros.add(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "Frodo Bolsón, un hobbit, se embarca en un peligroso viaje para destruir el Anillo Único y evitar que caiga en manos del Señor Oscuro. Una épica de fantasía con una construcción de mundo inigualable.", new HashSet<>(Arrays.asList(GeneroEnum.FANTASIA, GeneroEnum.AVENTURA))));
        libros.add(new Libro("Orgullo y Prejuicio", "Jane Austen", "La novela sigue a la vivaz Elizabeth Bennet y el orgulloso Mr. Darcy en su complicada relación. Explora temas de clase social, matrimonio y reputación, con un humor sutil y una aguda observación de la sociedad.", new HashSet<>(Arrays.asList(GeneroEnum.ROMANCE, GeneroEnum.DRAMA))));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Alonso Quijano, un hidalgo enloquecido por la lectura de novelas de caballería, se proclama caballero andante. Junto a su fiel escudero Sancho Panza, vive aventuras que confunden la realidad con la fantasía.", new HashSet<>(Arrays.asList(GeneroEnum.AVENTURA, GeneroEnum.COMEDIA))));
        libros.add(new Libro("Crimen y Castigo", "Fiódor Dostoievski", "Rodion Raskólnikov, un joven estudiante, comete un asesinato y lucha con su conciencia. Un profundo análisis psicológico sobre la moralidad, el castigo y la redención del ser humano. Una lectura intensa.", new HashSet<>(Arrays.asList(GeneroEnum.DRAMA, GeneroEnum.PSICOLOGIA, GeneroEnum.FILOSOFIA))));
        libros.add(new Libro("Matar a un Ruiseñor", "Harper Lee", "Atticus Finch, un abogado, defiende a un hombre negro acusado de violación en el sur de EE. UU. en la década de 1930. Narrada por su hija, Scout, la historia aborda la injusticia racial y la inocencia perdida.", new HashSet<>(Arrays.asList(GeneroEnum.DRAMA, GeneroEnum.NOVELA_HISTORICA))));
        libros.add(new Libro("Moby Dick", "Herman Melville", "El capitán Ahab busca vengarse de una ballena blanca. Una épica del mar que explora la obsesión, la locura y la naturaleza del bien y el mal. Una de las grandes novelas americanas.", new HashSet<>(Arrays.asList(GeneroEnum.AVENTURA, GeneroEnum.DRAMA))));
        libros.add(new Libro("La Odisea", "Homero", "El héroe griego Odiseo viaja de vuelta a casa después de la guerra de Troya. Enfrenta monstruos, diosas y peligros mientras su esposa Penélope lo espera. Una historia épica de regreso a casa.", new HashSet<>(Arrays.asList(GeneroEnum.AVENTURA, GeneroEnum.POESIA))));
        libros.add(new Libro("Dracula", "Bram Stoker", "Jonathan Harker viaja a Transilvania para ayudar al Conde Drácula a comprar una propiedad en Londres, pero pronto descubre que el conde no es quien parece. Una novela de terror que dio origen a un mito.", new HashSet<>(Arrays.asList(GeneroEnum.TERROR, GeneroEnum.THRILLER))));
        libros.add(new Libro("Frankenstein", "Mary Shelley", "Víctor Frankenstein, un ambicioso estudiante de ciencias, crea una criatura y luego la abandona. Una novela que explora la responsabilidad científica, la soledad y la búsqueda de identidad.", new HashSet<>(Arrays.asList(GeneroEnum.TERROR, GeneroEnum.CIENCIA_FICCION))));
        libros.add(new Libro("El Gran Gatsby", "F. Scott Fitzgerald", "Jay Gatsby, un millonario enigmático, obsesionado con una mujer casada. La historia es una crítica a la decadencia de la 'Era del Jazz' en EE. UU., la riqueza y el llamado 'sueño americano'.", new HashSet<>(Arrays.asList(GeneroEnum.NOVELA_HISTORICA, GeneroEnum.DRAMA, GeneroEnum.ROMANCE))));
        libros.add(new Libro("El Retrato de Dorian Gray", "Oscar Wilde", "Dorian Gray, un joven apuesto, desea que un retrato envejezca en su lugar. La novela es un examen de la belleza, la moralidad y la corrupción del alma a través de los años. Un clásico gótico.", new HashSet<>(Arrays.asList(GeneroEnum.MISTERIO, GeneroEnum.DRAMA))));
        libros.add(new Libro("Un Mundo Feliz", "Aldous Huxley", "En un futuro donde la felicidad está programada y las personas nacen en castas, un individuo que no encaja explora un mundo 'salvaje'. Una novela distópica que cuestiona la libertad y el precio de la estabilidad.", new HashSet<>(Arrays.asList(GeneroEnum.CIENCIA_FICCION, GeneroEnum.FILOSOFIA))));
        libros.add(new Libro("Las Aventuras de Alicia en el País de las Maravillas", "Lewis Carroll", "Alicia persigue un conejo blanco y cae en un mundo de lógica retorcida y personajes absurdos. Un viaje onírico que ha influenciado la literatura y el arte. Una historia de fantasía y sin sentido.", new HashSet<>(Arrays.asList(GeneroEnum.FANTASIA, GeneroEnum.INFANTIL, GeneroEnum.AVENTURA))));
        libros.add(new Libro("El Conde de Montecristo", "Alexandre Dumas", "Edmond Dantès, un joven marinero, es encarcelado por una traición injusta y planea una elaborada venganza. Un clásico de la literatura francesa sobre la traición, el destino y la redención. Una novela de acción y drama.", new HashSet<>(Arrays.asList(GeneroEnum.AVENTURA, GeneroEnum.DRAMA))));
        libros.add(new Libro("Hamlet", "William Shakespeare", "El príncipe Hamlet busca vengar el asesinato de su padre a manos de su tío, el nuevo rey. Una de las obras más influyentes de la literatura universal, explorando la venganza, el destino y la locura. Un drama clásico.", new HashSet<>(Arrays.asList(GeneroEnum.DRAMA, GeneroEnum.THRILLER))));
        libros.add(new Libro("Siddhartha", "Hermann Hesse", "Siddhartha, un joven indio, emprende un viaje espiritual para encontrar la iluminación y la paz interior. Una novela que explora la búsqueda de la sabiduría y el autoconocimiento. Ideal para la reflexión personal.", new HashSet<>(Arrays.asList(GeneroEnum.FILOSOFIA, GeneroEnum.BIOGRAFIA, GeneroEnum.AUTOAYUDA))));
        libros.add(new Libro("El Alquimista", "Paulo Coelho", "Santiago, un pastor andaluz, emprende un viaje por el desierto en busca de un tesoro que se le ha revelado en sus sueños. Una novela que nos invita a seguir nuestros sueños y escuchar a nuestro corazón. Un viaje espiritual.", new HashSet<>(Arrays.asList(GeneroEnum.AVENTURA, GeneroEnum.FILOSOFIA, GeneroEnum.AUTOAYUDA))));
    }



    public Libro buscarLibroEstricto(String query) {
        if (query == null || query.trim().isEmpty()) {
            return null;
        }

        String lowerCaseQuery = query.toLowerCase().trim();

        //por título exacto
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().equals(lowerCaseQuery)) {
                return libro;
            }
        }

        //coincidencia parcial en título o autor
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(lowerCaseQuery) ||
                    libro.getAutor().toLowerCase().contains(lowerCaseQuery)) {
                return libro;
            }
        }

        return null;
    }

    //    public ArrayList<Libro> obtenerTodosLosLibros() {
//        return new ArrayList<>(libros); // Devuelve una copia para evitar modificaciones externas
//    }
// Sirve para cuando use  searchview-> busca en listas -> recyclerview (es una lista)

//    public ArrayList<Libro> buscarLibros(String query) {
//        if (query == null || query.trim().isEmpty()) {
//            return obtenerTodosLosLibros();
//        }
//        String lowerCaseQuery = query.toLowerCase();
//        ArrayList<Libro> resultados = new ArrayList<>();
//        for (Libro libro : libros) {
//            if (libro.getTitulo().toLowerCase().contains(lowerCaseQuery) ||
//                    libro.getAutor().toLowerCase().contains(lowerCaseQuery)) {
//                resultados.add(libro);
//            }
//        }
//        return resultados;
//    }



}



