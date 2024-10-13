package Service;

import Entity.BoardGameEntity;
import Interface.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
/**
 * Service class for managing board games.
 */
@Service
public class BoardGameService {
    @Autowired
    private BoardGameRepository boardGameRepository;
    /**
     * Add a new board game to the database.
     * @param boardgameName
     * @param maxPlayers
     * @param lobbyId
     * @param imagesetId
     * @param description
     * @param dateAdded
     * @param rules
     * @param category
     * @return 
     */
    public BoardGameEntity addBoardGame(String boardgameName, int maxPlayers, long lobbyId, byte[] imagesetId,
                                         String description, Date dateAdded, String rules, String category) {
        BoardGameEntity boardGame = new BoardGameEntity();
        boardGame.setBoardgame_name(boardgameName);
        boardGame.setBoardgame_max_player(maxPlayers);
        boardGame.setLobby_id(lobbyId);
        boardGame.setImageset_id(imagesetId);
        boardGame.setBoardgame_description(description);
        boardGame.setBoardgame_dateAdded(dateAdded);
        boardGame.setBoardgame_rules(rules);
        boardGame.setBoardgame_category(category);
        return boardGameRepository.save(boardGame);
    }

    public List<BoardGameEntity> getAllBoardGames() {
        return boardGameRepository.findAll();
    }

    public BoardGameEntity getBoardGame(long boardgameId) {
        return boardGameRepository.findById(boardgameId).orElse(null);
    }
    
    public void deleteBoardGame(long boardgameId) {
        boardGameRepository.deleteById(boardgameId);
    }

    public BoardGameEntity updateBoardGame(long boardgameId, String boardgameName, int maxPlayers, long lobbyId,
                                            byte[] imagesetId, String description, Date dateAdded,
                                            String rules, String category) {
        BoardGameEntity boardGame = boardGameRepository.findById(boardgameId).orElse(null);
        if (boardGame != null) {
            boardGame.setBoardgame_name(boardgameName);
            boardGame.setBoardgame_max_player(maxPlayers);
            boardGame.setLobby_id(lobbyId);
            boardGame.setImageset_id(imagesetId);
            boardGame.setBoardgame_description(description);
            boardGame.setBoardgame_dateAdded(dateAdded);
            boardGame.setBoardgame_rules(rules);
            boardGame.setBoardgame_category(category);
            return boardGameRepository.save(boardGame);
        }
        return null;
    }
}
