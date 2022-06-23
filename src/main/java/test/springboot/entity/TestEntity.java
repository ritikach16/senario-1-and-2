package test.springboot.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import test.validation.NonNegative;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "test_entity")
public class TestEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

 //  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "not blank number")
//    @NonNegative(message = "number cannot be negative")
    @Min(0)
    @Column(name = "number")
    private Long number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
