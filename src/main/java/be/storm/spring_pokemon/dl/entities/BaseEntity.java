package be.storm.spring_pokemon.dl.entities;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Getter
@EqualsAndHashCode(of = {"id"}) @ToString
@NoArgsConstructor
public abstract class BaseEntity {

    @Id
    @Setter
    private UUID id;
    @CreationTimestamp
    private LocalDateTime creationDate;
    @UpdateTimestamp
    private LocalDateTime updateDate;

    public BaseEntity(UUID id) {
        this.id = id;
    }
}
