#include <stdio.h>

void mostrarVetor(int vet[], int size){
    printf("[");
    for(int i = 0; i < size; i++){
        printf("%d", vet[i]);
        if(i != size-1){
            printf(", ");
        }
    }
    printf("]");
}
void inserirFinal(int vet[], int size){
    int valor;
    scanf("%d", &valor);
    vet[size] = valor; 
}
int inserirLote(int vet[], int size){
    int qtd = 0, valor = 0;
    scanf("%d", &qtd);
    for(int i = size; i < (size + qtd); i++){
        scanf("%d", &valor);
        vet[i] = valor;
    }
    return qtd;
}
void contarOcorrencioas(int vet[], int size){
    int num = 0, aux = 0;
    scanf("%d", &num);
    for(int i = 0; i < size; i++){
        if(vet[i] == num){
            aux++;
        }
    }
    printf("%d", aux);
}
void mostrarAoContrario(int vet[], int size){
    int vet2[99];
    for(int i = 0; i < size; i++){
        vet2[(size - 1) - i] = vet[i];
    }
    printf("[");
    for(int i = 0; i < size; i++){
        printf("%d ", vet2[i]);
    }
    printf("]");
}
int inserirComeco(int vet[], int size){
    for(int i = (size-1); i >= 0; i--){
        vet[i+1] = vet[i]; 
    }
    int valor;
    scanf("%d", &valor);
    vet[0] = valor; 
}
int removerComeco(int vet[], int size){
    for(int i = 0; i < size; i++){
        vet[i] = vet[i + 1]; 
    }
}
void inserirNoMeio(int vet[], int size){
    int pos = 0, num = 0;
    scanf("%d %d", &pos, &num);
    for(int i = (size - 1); i >= pos-1; i--){
        vet[i+1] = vet[i]; 
    }
    vet[pos - 1] = num; 
}
void removerNoMeio(int vet[], int size){
    int pos = 0;
    scanf("%d", &pos);
    for(int i = pos-1; i < size; i++){
        vet[i] = vet[i + 1]; 
    }
}
int removerPorValor(int vet[], int size){
    int num = 0, pos = 0, aux = 0;
    scanf("%d", &num);
    for(int i = size - 1; i >= 0; i--){
        if(vet[i] ==  num){
            aux++;
            pos = i;
            for(int x = pos; x < size; x++){
                vet[x] = vet[x + 1];
            }
            size--;
            i--;
        }
    }
    return aux;
}
int encontrarComValore(int vet[], int size){
    int num = 0;
    scanf("%d", &num);
    for(int i = 0; i < size; i++){
        if(vet[i] == num){
            return i;
        }
    }
}

int main(){
    char letra = ' ';
    int vet[99];
    int size = 0;
    for(;;){
        scanf(" %c", &letra);
        if(letra == 's'){
            mostrarVetor(vet, size);
        }else if(letra == 'q'){
            break;
        }else if(letra == 'a'){
            inserirFinal(vet, size);
            size++;
        }else if(letra == 'b'){
            size += inserirLote(vet, size);
        }else if(letra == 'c'){
            contarOcorrencioas(vet, size);
        }else if(letra == 'r'){
            size--;
        }else if(letra == 'S'){
            mostrarAoContrario(vet, size);
        }else if(letra == 'A'){
            inserirComeco(vet, size);
            size++;
        }else if(letra == 'R'){
            removerComeco(vet, size);
            size--;
        }else if(letra == 'i'){
            inserirNoMeio(vet, size);
            size++;
        }else if(letra == 'e'){
            removerNoMeio(vet, size);
            size--;
        }else if(letra == 'E'){
            size -= removerPorValor(vet, size);
        }else if(letra == 'X'){
            size = 0;
        }else if(letra == 'f'){
            printf("%d", encontrarComValore(vet, size));
        }
        
    }
}