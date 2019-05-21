package packa;

public class Main {

    public static void main(String[] args) {
        char[] z = {1059,1076,1086,1074,1077,1085,1082,1086,32,1055,1069,45,49,55,49};
        for(char c: z){
            System.out.print(c);
        } System.out.print("\n");
        NIOCopy.nio_copy(args);
        ShowFile.show_file(args);
        ExplicitChannelWrite.explicitChannelWrite(args);
        MappedChannelRead.mappedChannelRead(args);
        MappedChannelWrite.mappedChannelWrite(args);
    }
}
