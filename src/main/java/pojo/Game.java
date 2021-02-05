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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public String getPage_indx() {
        return page_indx;
    }

    public void setPage_indx(String page_indx) {
        this.page_indx = page_indx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGame_link() {
        return game_link;
    }

    public void setGame_link(String game_link) {
        this.game_link = game_link;
    }

    public String getGame_pht() {
        return game_pht;
    }

    public void setGame_pht(String game_pht) {
        this.game_pht = game_pht;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
