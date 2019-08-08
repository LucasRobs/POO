#include <stdio.h>
typedef struct{
    char nome;
    char autor;
    int isbn;
    int ano;
    int id;
} Livro;

Livro * livro_create(char nome, char autor, int isbn, int ano, int id){
    Livro * liv = (Livro*) malloc(sizeof(Livro));
    liv->nome = nome;
    liv->autor = autor;
    liv->isbn = isbn;
    liv->ano = ano;
    liv->id = id;
    return liv;
}

int main(){
    char nome, autor;
    int isbn, ano, id = 0;
    scanf("%[^/n] %[^/n] %d %d %d",nome ,autor ,&isbn ,&ano);
    livro_create(nome, autor, isbn, ano, id);
    id++;
}