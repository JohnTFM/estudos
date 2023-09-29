
export class Boi {
    fase;
    peso;
    idade;
    tipo;

    constructor(props) {
        this.peso = props.peso;
        this.idade = props.idade;
        this.fase = props.fase;
        this.tipo = props.tipo;

    }


}


let boiArray = [];
for(let i=0;i<10;i++){
    boiArray.push(new Boi({
        peso : 50 + i,
        idade : i,
        fase : `Cerca${i}`,
        tipo : 'boioio'
    }))
}
function toRow(obj) {
    const valores = [];
    for (const key in obj) {
        valores.push(obj[key]);
    }
    return valores;
}

function capitalize(key){
    return `${key.charAt(0).toUpperCase()}${key.slice(1)}`
}