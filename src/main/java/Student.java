import lombok.*;


@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Data
@RequiredArgsConstructor
@Builder
public class Student {
    private final String name;
    private int age;
    private String schoolName;
    private String hobby;
    private final String parent;
}
