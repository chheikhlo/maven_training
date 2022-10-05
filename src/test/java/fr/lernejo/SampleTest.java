package fr.lernejo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void testFactInit(){
        var Sample = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> Sample.fact(-3));
    }

    @Test
    void testFact(){
        var Sample = new Sample();
        int i = Sample.fact(3);
        Assertions.assertThat(i).isEqualTo(6);

    }

    @Test
    void testOperation(){
        var Sample = new Sample();
        int mult = Sample.op(fr.lernejo.Sample.Operation.MULT,5,7);
        int add = Sample.op(fr.lernejo.Sample.Operation.ADD,5,7);

        Assertions.assertThat(mult).isEqualTo(35);
        Assertions.assertThat(add).isEqualTo(12);

    }

}
