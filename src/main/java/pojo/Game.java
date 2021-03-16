package pojo;

import lombok.*;

@Builder
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    private Integer id;
    private String url;
    private String page_indx;
    private String name;
    private String price;
    private String game_link;
    private String game_pht;

}
