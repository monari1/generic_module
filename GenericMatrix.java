public abstract class GenericMatrix <E extends Number> {
    protected  abstract E add(E o1, E o2);
    protected  abstract E multiply(E o1, E o2);
    protected  abstract  E zero();

    public E[][] addMatrix(E[][] matrix1, E[][] matrix2){
        if ((matrix1.length != matrix2.length)|| (matrix1[0].length!= matrix2[0].length)){
            throw new RuntimeException("Matrix do not have same length");
        }
        E[][] result = (E[][])new Number[matrix1.length][matrix1[0].length];
        for (int i=0; i<result.length; i++)
            for (int j = 0; j<result[i].length;j++){
                result[i][j] = add(matrix1[i][j], matrix2[i][j]);
            }


        return result;
    }



}
