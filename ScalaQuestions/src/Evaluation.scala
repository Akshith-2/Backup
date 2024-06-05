import scala.collection.{breakOut, mutable}
object Evaluation {
        def evaluation(str:String):Int={
       def precendece(ch:Char):Int={
            ch match {
                case '+'|'-'=>1
                case '*'|'/'=>2
                case _=>0

       }
        }
            def operation(a:Int,b:Int,ch:Char):Int={
                ch match{
                    case '+' => a+b
                    case '-' => a-b
                    case '*' => a*b
                    case '/' => a/b
                }

            }
            var stackValues=scala.collection.mutable.Stack[Int]()
            var stackOperators=scala.collection.mutable.Stack[Char]()
            var i=0
            while(i<str.length){
                if(str(i)==' '){
                    i+=1
                }
                else if(Character.isDigit(str(i))){
                    var num=0
                    while(i<str.length&&Character.isDigit(str(i))){
                        num=num*10+(str(i)-'0')
                        i+=1
                    }
                    stackValues.push(num)
                }
                else if(str(i)=='('){
                    stackOperators.push(str(i));
                    i+=1
                }
                else if(str(i)==')'){
                    while(stackOperators.top!='('){
                        var a=stackValues.pop()
                        var b=stackValues.pop()
                        var o=stackOperators.pop()
                        stackValues.push(operation(b,a,o))
                    }
                    stackOperators.pop()
                    i+=1


                }
                else{
                    while(!stackOperators.isEmpty && precendece(stackOperators.top)>=precendece(str(i))){
                        var a = stackValues.pop()
                        var b = stackValues.pop()
                        var o = stackOperators.pop()
                        stackValues.push(operation(b, a, o))
                    }
                    stackOperators.push(str(i))
                    i+=1
                }
            }
            while(!stackOperators.isEmpty){
                var a = stackValues.pop()
                var b = stackValues.pop()
                var o = stackOperators.pop()
                stackValues.push(operation(b, a, o))
            }
            stackValues.pop()

        }
    def main(args:Array[String]): Unit ={
        var eval="1/4+2*(4/7+(8*2-6))"

        print("After Evaluation of expression the result is:"+evaluation(eval))
    }

}
