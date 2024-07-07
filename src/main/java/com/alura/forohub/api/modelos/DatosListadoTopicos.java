package com.alura.forohub.api.modelos;

public record DatosListadoTopicos(
        long idtopico,
        String titulo,
        String mensaje,
        Integer autor,
        String respuestas
) {
    public DatosListadoTopicos(Topico topico){
        this(topico.getIdtopico(), topico.getTitulo(), topico.getMensaje(), topico.getAutor(), topico.getRespuestas());
    }
}
