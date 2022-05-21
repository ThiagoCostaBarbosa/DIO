import React from "react";
import * as S from './styled'

const RepositoryItem = ({ name, linkToRepo, fullName }) => {
  return (
    <S.Wrapper>
      <S.WrapperTitle>{name}</S.WrapperTitle>
      <S.WrapperFullName>{fullName}</S.WrapperFullName>
      <S.WrapperLink href={linkToRepo} target="_blank" rel="noreferrer">
        {linkToRepo}
      </S.WrapperLink>
    </S.Wrapper>
  );
};
export default RepositoryItem;
