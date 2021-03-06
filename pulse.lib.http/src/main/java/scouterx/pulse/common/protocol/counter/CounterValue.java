package scouterx.pulse.common.protocol.counter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Gun Lee (gunlee01@gmail.com) on 2016. 7. 30.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CounterValue {
    String name;
    Number value;
}
