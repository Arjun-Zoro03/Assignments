package arjun.streams;

import java.util.stream.Stream;

public class StreamCall {
    private final Stream<Student> studentStream;
    StreamCall(Stream<Student> studentStream){
        this.studentStream = studentStream;
    }

}
