import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BrainfuckInterpreter extends BrainfuckBaseVisitor<Byte> {
    private final int LENGTH = 65443;
    private final byte[] tape = new byte[LENGTH];
    private int dataPointer = 0;

    @Override
    public Byte visitMain(BrainfuckParser.MainContext ctx) {
        return visit(ctx.com());
    }


    @Override
    public Byte visitLoop(BrainfuckParser.LoopContext ctx) {

        while (tape[dataPointer] != 0) visit(ctx.com(0));

        return visit(ctx.com(1));
    }

    @Override
    public Byte visitLt(BrainfuckParser.LtContext ctx) {
        dataPointer = (dataPointer == 0) ? LENGTH - 1 : dataPointer - 1;
        return visit(ctx.com());
    }

    @Override
    public Byte visitGt(BrainfuckParser.GtContext ctx) {
        dataPointer = (dataPointer == LENGTH - 1) ? 0 : dataPointer + 1;
        return visit(ctx.com());
    }

    @Override
    public Byte visitPlus(BrainfuckParser.PlusContext ctx) {
        tape[dataPointer]++;
        return visit(ctx.com());
    }

    @Override
    public Byte visitMinus(BrainfuckParser.MinusContext ctx) {
        tape[dataPointer]--;
        return visit(ctx.com());
    }

    @Override
    public Byte visitDot(BrainfuckParser.DotContext ctx) {
        System.out.print((char) tape[dataPointer]);
        return visit(ctx.com());
    }

    @Override
    public Byte visitComma(BrainfuckParser.CommaContext ctx) {
        try {
            do {
                tape[dataPointer] = (byte) System.in.read();
            } while (tape[dataPointer] == '\n');
        }
        catch (IOException e) { throw new RuntimeException(e); }

        return visit(ctx.com());
    }

    @Override
    public Byte visitNil(BrainfuckParser.NilContext ctx) {
        return '\0';
    }
}
