package io.member.impl;

import io.member.Member;
import io.member.MemberRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FileMemberRepository implements MemberRepository {

    private final static String FILE_PATH = "temp/members-txt.dat";
    private final static String DELIMITER = ",";

    @Override
    public void add(Member member) {

        try (BufferedWriter br = new BufferedWriter(new FileWriter(FILE_PATH, UTF_8, true))) {
            br.write(member.getId() + DELIMITER + member.getName() + DELIMITER + member.getAge());
            br.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Member> findAll() {
        List<Member> members = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH, UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] memberData = line.split(DELIMITER);
                members.add(new Member(memberData[0], memberData[1], Integer.valueOf(memberData[2])));
            }
            return members;
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
