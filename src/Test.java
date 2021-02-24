public class Test {
    public static void main(String[] args) {
        String json = "{\"service\":\"Garena 33 Shell\",\"price\":\"9090\",\"message\":\"270029968/CODE :3348402044511999\",\"trxid\":\"312239\",\"status\":\"success\"}";
        System.out.println(json);
        json=json.replace("\"","");
        json=json.replace("{","");
        json=json.replace("}","");
        System.out.println(json);
    }
}
